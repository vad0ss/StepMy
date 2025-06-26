document.addEventListener('DOMContentLoaded', () => {

     console.log('DOM full loaded');

     const userInput = document.getElementById('userInput');
     const changeTextBtn = document.getElementById('changeTextBtn');
     const addListItemBtn = document.getElementById('addListItemBtn');
     const highlightHeaderBtn = document.getElementById('highlightHeaderBtn');
     const removeLastItemBtn = document.getElementById('removeLastItemBtn');
     const itemList = document.getElementById('itemList');
     const mainHeader = document.getElementById('mainHeader');
     const mainText = document.getElementById('mainText');

     changeTextBtn.addEventListener('click', () => {
        const inputValue = userInput.value;
        mainText.textContent = inputValue ? inputValue : 'Please Enter Text';
     });

     addListItemBtn.addEventListener('click', () => {
        const newItem = document.createElement('li');
        newItem.textContent = `Element ${itemList.children.length + 1}`;
        itemList.appendChild(newItem);
     });

     highlightHeaderBtn.addEventListener('click', () => {
        mainHeader.style.color = 'red';
     });

     removeLastItemBtn.addEventListener('click', () => {
        itemList.removeChild(itemList.lastElementChild); 
     });

 });