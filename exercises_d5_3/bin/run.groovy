
matrix = new Matrix(3, 3)
println matrix.toString();

matrix.setElement(2, 2, 2)
println matrix.toString();

matrix.setRow(0, "10,10,10")
println matrix.toString();

matrix.setColumn(1, "12,13,14")
println matrix.toString();

println matrix.prettyPrint();

matrix.setMatrix("1,2,3;4,5,6;7,8,9")
println matrix.toString();
