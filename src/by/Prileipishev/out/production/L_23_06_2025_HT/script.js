// { name: "Иван", age: 20, group: "ПИ-101" }

function createStudent(name, age, group) {
     let student = {
        name : name,
        age : age,
        group : group
     }
     return student
}

console.log(createStudent("Иван", 20, "ПИ-101"));

// { brand: "Toyota", model: "Corolla", year: 2022, color: "синий" }

let car = {
  brand: "Toyota",
  model: "Corolla",
  year: 2020
};

function updateCar(brand, model, year,  color) {
    car.brand = brand;
    car.model = model;
    car.year = year;
    car.color = color;

    return car;
}

console.log(updateCar("Toyota", "Corolla", 2022, "синий"));

// 3

let user = { name: "Анна", age: 25, isAdmin: true };

function countProperties(obj) {
    return Object.keys(obj).length;
}

console.log("User properties counter : " + countProperties(user));

// Напишите цикл `for`, который выводит числа от `1` до `N` (где `N` — заданное число).  

function viewNumbers(n) {
     for(i = 1; i <= n; i++) {
        console.log(i);
     }
}

viewNumbers(5);

// Используя цикл `for`, вычислите сумму всех элементов. 

let numbers = [10, 20, 30, 40, 50];

function numCounter(numbers) {
     let result = 0;
     for(i = 0; i < numbers.length; i++) {
        result += numbers[i];
     }

     return result;
}

function numCounterWithReduce(numbers) {
    return numbers.reduce((acc, cur) => acc + cur, 0);
}

console.log("Classic for : " + numCounter(numbers));
console.log("Reduce : " + numCounterWithReduce(numbers));

// Напишите цикл `for`, который выводит индекс элемента `"апельсин"`.  

let fruits = ["яблоко", "банан", "апельсин", "груша"];

function arrIndexByElementSearch(arr, el) {
     for(i = 0; i < arr.length; i++) {
        if(arr[i] === el) return i;
     }
}

console.log(arrIndexByElementSearch(fruits, "апельсин"));

// Используя цикл `for...in`, выведите все ключи и их значения в формате:  
// ```
// title: JavaScript для начинающих  
// author: Иван Петров  
// pages: 200  
// price: 1500  
// ```

let book = {
  title: "JavaScript для начинающих",
  author: "Иван Петров",
  pages: 200,
  price: 1500
};


function objKeyView(obj) {
    for (const key in obj) {
        console.log(key + ": " + obj[key]);
    }  
}

objKeyView(book);

// Дан массив объектов (студентов):  
// ```javascript
// let students = [
//   { name: "Алексей", age: 20, group: "ПИ-101" },
//   { name: "Мария", age: 19, group: "ПИ-102" },
//   { name: "Иван", age: 21, group: "ПИ-101" }
// ];
// ```  
// Напишите цикл `for`, который выводит имена студентов из группы `"ПИ-101"`.

let students = [
  { name: "Алексей", age: 20, group: "ПИ-101" },
  { name: "Мария", age: 19, group: "ПИ-102" },
  { name: "Иван", age: 21, group: "ПИ-101" }
];

function viewStudentByGroup(students, group) {
    
    for(i = 0; i < students.length; i++) {
        let student = students[i];
        let keys = Object.keys(student);
        let groupKey = keys[2];
        let groupName = student[groupKey];

        if(groupName === group) {
            console.log(student);
        }
    }
}

viewStudentByGroup(students, "ПИ-101");

// Дан объект с товарами и их ценами:  
// ```javascript
// let products = {
//   "ноутбук": 50000,
//   "телефон": 30000,
//   "наушники": 8000,
//   "мышь": 2000
// };
// ```  
// Напишите цикл `for...in`, который находит название самого дорогого товара.  

// **Пример вывода:**  
// ```
// Самый дорогой товар: ноутбук (50000)

let products = {
  "ноутбук": 50000,
  "телефон": 30000,
  "наушники": 8000,
  "мышь": 2000
};

function searchByMaxCost(products) {

    let maxValue = 0;
    let resKey = null;

    for (const key in products) {
        if(products[key] > maxValue) {
            maxValue = products[key];
            resKey = key;
        }
    }

    return resKey + "(" + products[resKey] + ")";

}

console.log("Самый дорогой товар: " + searchByMaxCost(products));




