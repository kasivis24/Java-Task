class ZigZag {

    public static void main(String[] args) {
        System.out.println(convert("abcdefghijklmnopq",4));
    }

    public static String convert(String s, int numsRow) {
        String result = "";

        int pos = 0;

        int row = 0;

        int col = 0;

        String[][] matrix = new String[numsRow][1];

        boolean flag = false;

        if (s.length() <= numsRow || numsRow <= 1){
            return s;
        }
        else {
            while (pos < s.length()){


                if (!flag){
                    matrix = zingZing(row,col,matrix,flag,s,pos);
                    row += 1;

                    if (row >= numsRow){
                        row -= 1;
                        flag = true;
                    }
                }
                else {
                    col += 1;
                    row -= 1;
                    matrix = zingZing(row,col,matrix,flag,s,pos);

                    if (row <= 0){
                        flag = false;
                        row += 1;
                    }
                }

                pos += 1;
            }
        }




        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == null){
                    continue;
                }
                else {
                    result += matrix[i][j];
                }
            }
        }

        return result;

    }

    public static String[][] zingZing(int row,int col,String[][] matrix,boolean flag,String mainString,int pos){

        if (!flag){

            matrix[row][col] = ""+mainString.charAt(pos);
            return matrix;

        }
        else {



            String[][] newStringMatrix = new String[matrix.length][matrix[0].length+1];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    newStringMatrix[i][j] = matrix[i][j];
                }
            }

            newStringMatrix[row][col] = ""+mainString.charAt(pos);
            String temp = ""+newStringMatrix[row][col];

            return newStringMatrix;

        }

    }


}