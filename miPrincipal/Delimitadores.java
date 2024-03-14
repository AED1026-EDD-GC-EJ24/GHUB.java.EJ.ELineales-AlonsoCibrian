package miPrincipal;

public class Delimitadores {
    public boolean evaluacionDelimitadores(String cadena) {
        Pila<String> pcaracteres = new Pila<String>();
        int i = 0;
        boolean masElementosPorLeer = true;
        while (i < cadena.length() && masElementosPorLeer) {
            char caracter = cadena.charAt(i);
            String s = charToString(caracter);
            i++;
            switch (caracter) {
                // en caso de apilar
                case '(':
                    pcaracteres.apilar(charToString(')'));
                    break;
                case '[':
                    pcaracteres.apilar(charToString(']'));
                    break;
                case '{':
                    pcaracteres.apilar(charToString('}'));
                    break;
                case '/':
                    if (siguienteEsAsterico(cadena, i)) {
                        pcaracteres.apilar(charToString('/'));
                        i++;
                    }
                    break;
                // en caso de desapilar
                case ')':
                case ']':
                case '}': {
                    // comparar que corresponda
                    String aux = pcaracteres.cima();
                    if (aux != null) {
                        if (s.compareTo(aux) == 0) {
                            // hay correspondencia por lo tanto son iguales y lo elimino
                            pcaracteres.retirar();
                        } else {
                            masElementosPorLeer = false;
                        }
                    }

                }
                case '*': {
                    if (siguienteEsDiagonal(cadena, i)) {
                        pcaracteres.retirar();
                        i++;
                    }
                }

                default:
                    break;
            }
        }//termina el while
        if (pcaracteres.esVacia() && masElementosPorLeer) {
            return true;
        } else {
            return false;
        }   
    }

    private static String charToString(char caracter) {
        return String.valueOf(caracter);
    }

    private static boolean siguienteEsAsterico(String cadena, int pos) {
        char car = cadena.charAt(pos);
        if (car == '*') {
            return true;
        } else
            return false;
    }

    private static boolean siguienteEsDiagonal(String cadena, int pos) {
        char car = cadena.charAt(pos);
        if (car == '/') {
            return true;
        } else
            return false;
    }
}
