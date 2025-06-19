let message = 'Text';
//alert(message);
const mess = 'Не изменяемая переменная';
console.log(mess);
let bool = true;
console.log(Number(bool));

let age = 35;

if(age === 44) {
    alert('мне ' + age);
}
 else if(age === 35) {
     console.log('угадал!');
 }
 else {
    console.log('Не угадал!');
}

let rr = age > 30 ? console.log('Больше') : console.log('Меньше');
function showMyAge(k = 12) {
     console.log('My age is : ' + k);
}

function sum(a,b) {
     return a + b;
}

for(let i = 0; i < 10; i++) {
    showMyAge();
}

console.log(sum(2,5));

function sqr(a,b) {
   return a**b;
}

console.log(sqr(5,2));
