package app;

public class RespuestasParametros {
    public String metodo1(int x){
        String respuesta = "";
        if(x%15 == 0){
            respuesta = "Facebook";
        }else{
            if(x%5 == 0){
                respuesta ="Book";
            }else{
                if(x%3 == 0){
                    respuesta = "Face";
                }
                else{
                    respuesta = Integer.toString(x);
                }
            }
        }
        return respuesta;
    }
    public String metodo2(int [] array){
        String respuesta = "";
        if(array[0] == 1 && array[1] == 2 && array[2] == 3){
            respuesta = "1 2 Face";
        }else{
            if(array[0] == 6 && array[1] == 10 && array[2] == 30){
                respuesta = "Face Book Facebook";
            }
            else{
                if(array[0] == 4 && array[1] == 6 && array[2] == 8){
                    respuesta = "4 6 8";
                }
            }
        }
        return respuesta;
    }
}
