public class ValidadorContrasenas {
    //La contraseña debe contener al menos un numero
    public boolean numeros(String contrasena){
        boolean contieneNumeros=false;
        String numeros="0123456789";
        for (int i = 0; i < contrasena.length(); i++) {
            for (int j = 0; j < numeros.length(); j++) {
                if(contrasena.substring(i,i+1).equals(numeros.substring(j,j+1))){
                    contieneNumeros=true;
                    break;
                }
            }
            if(contieneNumeros){
                break;
            }
        }
        return contieneNumeros;
    }
    //La contraseña debe ser minimo de 8 caracteres
    public boolean longitud(String contrasena){
        boolean longitudAdecuada=false;
        if(contrasena.length()>=8){
            longitudAdecuada=true;
        }
        return longitudAdecuada;
    }
    
}
