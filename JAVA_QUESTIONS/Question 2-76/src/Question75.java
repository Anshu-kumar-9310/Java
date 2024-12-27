class ConcatenateUsingStringBuilder {
    public static void main(String[] args) {
        System.out.println("Welcome in the world of StringBuilder.");
        StringBuilder sb = new StringBuilder();
        String[] str = new String[] {"Hello ","world ","this ","is ","me. ","I ","hope ","you ","are ","doing ","well."};

        for (String s : str) {
            sb.append(s);
        }

        System.out.println(sb);
    }
}
