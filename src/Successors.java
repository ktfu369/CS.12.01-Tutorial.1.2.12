public class Successors {
    public static Position findPosition(int num, int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == num){
                    return new Position(i,j);
                }
            }
        }
        return null;
    }

    public static Position[][] getSuccessorArray(int[][] arr){
        Position[][] out = new Position[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                Position newPos = findPosition(arr[i][j]+1,arr);
                out[i][j] = newPos;
            }
        }
        return out;
    }
}
