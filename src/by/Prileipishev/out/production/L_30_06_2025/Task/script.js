document.addEventListener('DOMContentLoaded', () => {

     console.log('DOM full loaded');

     const url = 'https://jsonplaceholder.typicode.com/photos?_limit=10';

     loadPhotosBtn.addEventListener('click', () => {
         getImages();
     });

     async function getImages() {
         try {
          const response = await fetch(url);
          if(!response.ok) throw new Error('Network error!');
          const images = await response.json();

          for(const image of images) {
             const DOMGallery = document.getElementById('gallery');
             const newDOMImage = document.createElement('img');
             newDOMImage.setAttribute('src', image.thumbnailUrl);
             DOMGallery.appendChild(newDOMImage);
          }

         } catch (error) {
             console.error(error);
         }
     }

 });