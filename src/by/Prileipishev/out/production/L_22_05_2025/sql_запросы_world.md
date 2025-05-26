### 0. Получить список всех стран с их столицами, континентами и языками

SELECT country.country_name, country.capital, continent.continent_name, lang.language_name
FROM countries AS country
LEFT JOIN continents AS continent ON country.continent_id=continent.continent_id
JOIN country_languages AS c_lang ON country.country_id=c_lang.country_id
JOIN languages  AS lang ON c_lang.language_id=lang.language_id;

### 1. Все страны с населением более 100 миллионов. Сортировка от крупных к менее.

SELECT country.country_name, country.population FROM countries AS country WHERE population > 100000000;

### 2. Города с населением более 5 миллионов (не столицы).  Сортировка от крупных к менее.

SELECT city.city_name, city.population FROM cities  AS city WHERE population > 5000000 AND NOT city.is_capital;

### 3. Страны в Европе

SELECT country.country_name, country.population, continent.continent_name FROM countries AS country 
LEFT JOIN continents AS continent ON country.continent_id=continent.continent_id 
WHERE continent.continent_name='Europe';

### 4. Количество городов в каждой стране

SELECT country.country_name, COUNT(city.city_name) FROM countries AS country 
LEFT JOIN cities AS city ON country.country_id=city.country_id GROUP BY country.country_name;

### 5. Все официальные языки в Швейцарии

SELECT c.country_name, l.language_name FROM countries c
JOIN country_languages cl ON c.country_id=cl.country_id
JOIN  languages l ON cl.language_id=l.language_id
WHERE country_name='Switzerland' AND cl.is_official=true;

### 6. Достопримечательности культурного типа (Cultural)

SELECT l.landmark_name, l.type FROM landmarks l WHERE l.type='Cultural';

### 7. Среднее население городов по странам. Сортировка от крупных к менее.

SELECT c.country_name, AVG(ci.population) AS av_population 
FROM countries c 
JOIN cities ci ON c.country_id=ci.country_id GROUP BY c.country_name;

### 8. Самые древние города (основаны до 1000 года) Сортировка от древних к менее.

SELECT c.city_name FROM cities c WHERE c.foundation_year < 1000;

### 9. Столицы с населением менее 1 миллиона

SELECT c.city_name FROM cities c WHERE c.population < 1000000 AND c.is_capital=true;

### 10. Языки, на которых говорят в Индии

SELECT c.country_name, l.language_name FROM countries c
JOIN country_languages cl ON c.country_id=cl.country_id
JOIN  languages l ON cl.language_id=l.language_id
WHERE country_name='India';

### 11. Вывести топ-5 стран с самыми большими столицами по населению

SELECT c.country_name, ci.city_name, ci.population AS population FROM countries c
JOIN cities ci ON c.country_id=ci.country_id
WHERE ci.is_capital=true ORDER BY ci.population DESC LIMIT 5;

### 12. Подсчитать общее население каждого континента

SELECT c.continent_name, SUM(co.population) AS population
FROM continents c
INNER JOIN countries co ON c.continent_id=co.continent_id GROUP BY c.continent_name;

### 13. Получить список всех стран с их столицами, континентами и языками

SELECT country.country_name, country.capital, continent.continent_name, lang.language_name
FROM countries country
INNER JOIN continents continent ON country.continent_id=continent.continent_id
INNER JOIN country_languages cl ON country.country_id=cl.country_id
INNER JOIN languages lang ON cl.language_id=lang.language_id;

### 14. Найти страны, где английский язык является официальным

SELECT country.country_name FROM countries country
INNER JOIN country_languages c_lang ON country.country_id=c_lang.country_id
WHERE c_lang.is_official=TRUE AND c_lang.language_id=3;

### 15. Получить список достопримечательностей с описанием и типом, построенных до 1800 года

SELECT landm.landmark_name, landm.type FROM landmarks landm WHERE landm.year_built < 1800;

### 16. Найти страны с наибольшей площадью, входящие в топ-5

### 17. Найти страны, где более 80% населения говорит на официальном языке

### 18. Вывести список всех стран с их крупнейшим городом

SELECT DISTINCT ON (c.country_name) c.country_name, ci.city_name, ci.population
FROM countries

### 19. Найти топ-3 страны с наибольшей средней плотностью населения в их городах

SELECT c.country_name, AVG(ci.population / c.area_sq_km) as avg_city_dansity
FROM countries c
JOIN cities ci ON c.country_id=ci.country_id
WHERE c.area_sq_km > 0
GROUP BY c.country_name
ORDER BY avg_city_dansity DESC
LIMIT 3;

### 20. Найти все континенты, где суммарное население стран больше 1 миллиарда, и вывести их страны

SELECT con.continent_name, c.country_name
FROM continents con
JOIN countries c ON con.continent_id = c.continent_id
WHERE con.continent_id IN (
SELECT c2.continent_id
FROM countries c2
GROUP BY c2.continent_id
HAVING SUM(c2.population) > 1000000000)
ORDER BY con.continent_name;

### 21. Найти страну с наибольшим количеством официальных языков

### 22.  Найти города с достопримечательностями, построенными до 1000 года, и отсортировать их по древности

### 23. Найти страны, у которых площадь меньше 1% от площади их континента


UPDATE cities
SET population = population + 1000000
WHERE city_name = 'Moscow'
RETURNING city_name, population;


CREATE VIEW europes_capitals


vse stolici evropi

SELECT cit.city_name, c.country_name, cit.population
FROM cities cit
INNER JOIN countries c ON cit.country_id = c.country_id
INNER JOIN continents cont ON c.continent_id = cont.continent_id
WHERE cont.continent_name = 'Europe' AND cit.is_capital = true;



CREATE VIEW europe_capitals AS
SELECT cit.city_name, c.country_name, cit.population
FROM cities cit
INNER JOIN countries c ON cit.country_id = c.country_id
INNER JOIN continents cont ON c.continent_id = cont.continent_id
WHERE cont.continent_name = 'Europe' AND cit.is_capital = true;


INSERT INTO Countries (country_name, country_code, capital, population, area_sq_km, continent_id) VALUES
('Belarus', 'BY', 'Minsk', 9500000, 207600, 6);

INSERT INTO world_geo.cities (city_name, country_id, population, foundation_year, is_capital) VALUES
('Minsk', 18, 1996730, 980, TRUE);



CREATE INDEX idx_landmarks_type_city ON landmarks(type, city_id);



