package ejemplo2;

public class Programa {
    public static void main(String[] args) {
        int edad = 10;
        
        //<,>,>=,<=,!=,==
        if((++edad) == 10) {
            System.out.println("fue true" + edad);                        
        }
        else if(edad == 12) {
            System.out.println("fue false" + edad);            
        }
        else {
            System.out.println("fue refaaalse" + edad);
        }
        //d aki pa bajo
        
        switch (edad) {
            case 11:
            case 10:
                System.out.println("tienes 10 o 11");                
                break;
            case 20:
                System.out.println("tienes 20");
                break;
            default:
                System.out.println("tienes una edad rara");
                break;
        }
    }
}
