document.addEventListener('DOMContentLoaded', () => {

     console.log('DOM full loaded');

     const url = 'https://jsonplaceholder.typicode.com/posts/1';
     const urlPost = 'https://jsonplaceholder.typicode.com/posts/';

     ajaxButton.addEventListener('click', () => {
        const xhr = new XMLHttpRequest();
        xhr.open('GET', url, true);
        xhr.onreadystatechange = function () {
           if(xhr.readyState === 4 && xhr.status === 200) {
               const post = JSON.parse(xhr.responseText);
               console.log(post);
               const newP = document.createElement('p');
               newP.textContent = post.title;
               document.body.appendChild(newP);
           }
        };
        xhr.send();
     });

     ajaxFetchButton.addEventListener('click', () => {
          fetch(url)
          .then(response => {
              if(!response.ok) throw new Error('Network error!');
              return response.json();
           })
           .then(data => console.log(data))
           .catch(error => console.error(error));
     });

     ajaxFetchAsyncButton.addEventListener('click', () => {
         getPost();
     });

     ajaxPost.addEventListener('click', () => {
          postPost();
     });

     async function getPost() {
         try {
          const response = await fetch(url);
          if(!response.ok) throw new Error('Network error!');
          const data = await response.json();
          console.log(data);
         } catch (error) {
             console.error(error);
         }
     }

     async function postPost() {
              try {
               const response = await fetch(urlPost, {
                   method: 'POST',
                   headers: { 'Content-Type': 'application/json'},
                   body: JSON.stringify({
                   title: 'New Post',
                   body: 'Content',
                   userId: 1 })
                  });
               if(!response.ok) throw new Error('Network error!');
                  const data = await response.json();
                  console.log(data);
              } catch (error) {
                  console.error(error);
              }
     }

 });