public class TraverseSpiral {
    static int arr[][] = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19, 20},
            {21,22,23,24,25},
            {26,27,28,29,30},
            {31,32,33,34,35},
    };
    static int totalIndexToScan = arr[0].length * arr.length;

    static int globalScannedIndexCount = 0;

    public static void main(String[] args) {
        spiralTraverse();
    }

    private static void spiralTraverse(){
        int iConst = 0, jConst = 0;
        int iMove = 0,  jMove = 0;
        int nRow =  arr[0].length;
        int nCol = arr.length - 1;

        while(totalIndexToScan > globalScannedIndexCount) {
            // scan row - increment
            jMove = scanRowIncrement(iConst, jMove, nRow);
            nRow--;

            // Scan column - increment.
            jConst = jMove - 1;
            iMove = iConst + 1;
            iMove = scanColumnIncrement(iMove,jConst, nCol);
            nCol--;

            //Scan Row decrement
            iConst = iMove - 1;
            jMove = jConst - 1;
            jMove = scanRowDecrement(jMove,iConst, nRow);
            nRow--;

            // Scan Column decrement
            jConst = jMove + 1;
            iMove = iConst - 1;
            iMove = scanColumnDecrement(iMove,jConst, nCol);
            nCol--;
            iConst = iMove + 1;
            jMove = jConst + 1;
        }
    }


    private static int scanRowIncrement(int iConst, int jMove, int nRow) {
        int loopCount = 0;
        while(loopCount < nRow && totalIndexToScan > globalScannedIndexCount) {
            System.out.print(arr[iConst][jMove] + " ");
            jMove++;
            globalScannedIndexCount++;
            loopCount++;
        }
        System.out.println();
        return jMove;
    }
    private static int scanColumnIncrement(int iMove, int jConst, int nCol) {
        int loopCount = 0;
        while(loopCount < nCol && totalIndexToScan > globalScannedIndexCount) {
            System.out.print(arr[iMove][jConst] + " ");
            iMove++;
            globalScannedIndexCount++;
            loopCount++;
        }
        System.out.println();
        return  iMove;
    }

    private static int scanColumnDecrement(int iMove, int jConst, int nCol) {
        int loopCount = 0;
        while (loopCount < nCol && totalIndexToScan > globalScannedIndexCount) {
            System.out.print(arr[iMove][jConst] + " ");
            iMove--;
            globalScannedIndexCount++;
            loopCount++;
        }
        System.out.println();
        return iMove;
    }

    private static int scanRowDecrement(int jMove, int iConst, int nRow) {
        int loopCount = 0;
        while (loopCount < nRow && totalIndexToScan > globalScannedIndexCount) {
            System.out.print(arr[iConst][jMove] + " ");
            jMove--;
            globalScannedIndexCount++;
            loopCount++;
        }
        System.out.println();
        return jMove;
    }
}
