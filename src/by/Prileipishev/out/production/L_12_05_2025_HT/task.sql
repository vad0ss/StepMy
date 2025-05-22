-- 1. Создай таблицу `books` с полями: id, title VARCHAR(100) NOT NULL, author  VARCHAR(100), genreVARCHAR(50), price NUMERIC(5,2), pages INT, year INT.

CREATE TABLE books (
      id INT PRIMARY KEY,
	  title VARCHAR(100) not null,
	  author VARCHAR(100),
	  genre VARCHAR(50),
	  price NUMERIC(5,2),
	  pages INT,
	  year INT
) ;


-- 2. Добавь колонку `rating` типа `NUMERIC(2,1)`.


ALTER TABLE books ADD raiting NUMERIC(2,1);

-- 3. Сделай поле `title` обязательным (NOT NULL).

ALTER TABLE books ALTER COLUMN title SET NOT NULL;


-- 4. Переименуй колонку `genre` в `category`.

ALTER TABLE books RENAME COLUMN genre TO category;


--. Добавь ограничение: цена книги не может быть меньше 0.

ALTER TABLE books ADD CONSTRAINT price CHECK (price > 0);


--. Выведи все книги.

SELECT * FROM books;


-- Выведи книги, цена которых больше 20.

SELECT * FROM books WHERE price > 20;

--8. Выведи книги, у которых больше 300 страниц.

SELECT * FROM books WHERE pages > 300;

--9. Отсортируй книги по году издания по убыванию.

SELECT * FROM books ORDER BY year DESC;

--10. Выведи 5 самых дешёвых книг.

SELECT * FROM books ORDER BY price LIMIT 5;

--11. Найди среднюю цену всех книг.

SELECT AVG(price) FROM books;

--12. Найди количество книг по каждому жанру (используй `GROUP BY`).

SELECT COUNT(*) FROM books GROUP BY category;

--13. Выведи книги дороже **средней цены** (вложенный `SELECT`).

SELECT * FROM books WHERE price > (SELECT AVG(PRICE) FROM books);


--14. Найди книгу с наибольшим количеством страниц.

SELECT * FROM books WHERE pages = (SELECT MAX(pages) FROM books);

--15. Найди самую дорогую книгу каждого жанра (с `MAX(price)` и вложенным `SELECT`).

SELECT * FROM books book
WHERE price = (SELECT MAX(price) FROM books WHERE category = book.category);

--16. Выведи книги, где название содержит слово "Java" (регистр не учитывать).

SELECT * FROM books WHERE title ILIKE '%java%';

--17. Посчитай общее количество страниц всех книг.

SELECT SUM(pages) FROM books;

--18. Выведи книги, написанные после 2015 года и с ценой выше средней.

SELECT * FROM books WHERE price > (SELECT AVG(PRICE) FROM books) AND year > 2015;

--19. Выведи каждую книгу и среднюю цену книг по её жанру (подзапрос в `SELECT`).

SELECT
    *,
    (SELECT AVG(price)
        FROM books AS book2
        WHERE book2.category = book1.category
    )  AS avg_by_category_price
FROM books AS book1;

--20. Найди жанры, где есть книги дороже 50 и не дешевле 10 (используй `DISTINCT`, `IN`, `BETWEEN`).

SELECT DISTINCT category FROM books WHERE price BETWEEN 10 AND 50;


SELECT u.fullname as FIO, COUNT(o.total) AS Counter FROM users u INNER JOIN orders o ON u.id = o.user_id GROUP BY u.fullname;


SELECT country.country_name, country.capital AS country FROM countries LEFT JOIN continents AS continent ON country.continent_id=continent.continent_id;