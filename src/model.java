

public class model {
    private String nyckel;
    private String message;

    public Object encrypt(String nyckel, String message){
        int[] array = new int[message.length()];
        for (int i = 0; i < message.length(); i++) {
            String msgbin = Integer.toBinaryString(message.charAt(i));
            System.out.println("Binary message      " + msgbin);
            String temp = "0" + Integer.toBinaryString(nyckel.charAt(i));
            System.out.println("Key to binary       " + temp);
            for (int z = 0; z < msgbin.length(); z++) {
                if (msgbin.charAt(z) == temp.charAt(z)) {
                    array[z] = 0;
                } else {
                    array[z] = 1;
                }
            }
        }
        for (int i = 0;i < array.length;i++) {
            System.out.println(array);
        }
            return array;

    }
    /*public class decrypt(){
        System.out.println("Secret code         " + secret);
        //Dekryptera Secret Code
                for (int i = 0; i < message.length(); i++) {
            String temp = "0" + Integer.toBinaryString(nyckel.charAt(i));
            for (int z = 0; z < secret.length(); z++) {
                if (secret.charAt(z) == temp.charAt(z)) {
                    decryptedmessage += "0";
                } else {
                    decryptedmessage += "1";
                }
            }
        }
                System.out.println("Dekrypterat Message " + decryptedmessage);

    });
*/

}