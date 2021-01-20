# Un test de pruebas unitarias se divide en 3 secciones:

- Preparación.
- Ejecución.
- Aserción.

# Los pasos que se dan en las secciones son los siguientes:

        // 1 - preparación del test : pondremos a punto lo necesario para utilizar el test llamando a las clases necesarias.

                - Por ejemplo:  `RespuestasParametros test = new RespuestasParametros();`

        // 2 - Ejecución: llamar a los métodos necesarios y pasar unos parámetros para conseguir el resultado que queremos.

                - Por ejemplo:  `String comprobacion = test.metodo1(3);`

        // 3 - Aserciones: comprobar si el resultado final y el esperado es el mismo.

                - Por ejemplo:  `assertEquals("Face", comprobacion)`


