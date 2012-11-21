
matrix = new Matrix(3, 3)
println matrix.toString();
matrix.checkMatrix();

matrix.setElement(2, 2, 2)
println matrix.toString();

matrix.setRow(0, "10,10,10")
println matrix.toString();
matrix.checkMatrix();

matrix.setColumn(1, "12,13,14")
println matrix.toString();
println matrix.prettyPrint();
matrix.checkMatrix();

matrix.setMatrix("1,2,3;4,5,6;7,8,9")
println matrix.toString();
matrix.checkMatrix();

matrix.setMatrix("1,1,1;1,1,0;1,0,0")
println matrix.toString();
matrix.checkMatrix();

matrix.setMatrix("1,1,1;0,1,1;0,0,1")
println matrix.toString();
matrix.checkMatrix();

checker = new MatrixChecker();
int[] array = [1,2,3,4,5,6,6,5,4,3,2,1]
println array 
println (checker.isSymmetrical(array) == true ?  "MATCHES!" : "different :(")



array = [1,6,3,4,5,6,6,5,4,63,2,1]
println array
println (checker.isSymmetrical(array) == true ?  "MATCHES!" : "different :(")

int[][] array2d = [[1,2,3],[4,5,6],[6,5,4],[3,2,1]]
println array2d
println (checker.isSymmetrical(array2d) == true ?  "MATCHES!" : "different :(")

array2d = [[1,6,3],[4,5,6],[6,5,4],[63,2,1]]
println array2d
println (checker.isSymmetrical(array2d) == true ?  "MATCHES!" : "different :(")

array2d = [[1,2,3],[4,5,6],[6,5,4],[63,2,1]]
println array2d
println (checker.isSymmetrical(array2d) == true ?  "MATCHES!" : "different :(")


array2d = [[1,1,1,1],[0,1,1,1],[0,0,1,1],[0,0,0,1]]
println array2d
println (checker.isTriangular(array2d) == true ?  "TRIANGULAR!" : "not a triangle :(")

array2d = [[1,0,0,0],[1,1,0,0],[1,1,1,0],[1,1,1,1]]
println array2d
println (checker.isTriangular(array2d) == true ?  "TRIANGULAR!" : "not a triangle :(")

array2d = [[1,0,0,0],[1,1,1,1],[1,1,1,0],[1,1,1,1]]
println array2d
println (checker.isTriangular(array2d) == true ?  "TRIANGULAR!" : "not a triangle :(")

array2d = [[1,1,1,1],[1,1,0,0],[1,1,1,0],[1,1,1,1]]
println array2d
println (checker.isTriangular(array2d) == true ?  "TRIANGULAR!" : "not a triangle :(")