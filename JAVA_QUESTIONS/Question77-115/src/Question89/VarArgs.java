package Question89;

public class VarArgs {

    public void ConcatenateStrings(String ...str){
        StringBuilder sb = new StringBuilder();
        for (String s : str) {
            sb.append(s).append(" ");
        }
        System.out.println("Your String is: "+sb);
    }

    public static void main(String[] args) {

        VarArgs v = new VarArgs();
        v.ConcatenateStrings("hello","world");
        v.ConcatenateStrings("Anshu","is","learning","java");
        v.ConcatenateStrings("Today","is","not","a","good","day","for","me");
    }
}
