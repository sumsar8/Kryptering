public class controller{
    private model model;
    public controller(){
        model = new model();
        String message = "a";
        String nyckel = "*";
        model.encrypt(message, nyckel);
    }
    public static void main(String[]args){
        controller c = new controller();
    }
}
