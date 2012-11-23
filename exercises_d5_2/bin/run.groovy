
array_copier = new ArrayCopier()

int[] array1 = [1,2,3,4,5]
int[] array2 = [9,8,7,6,5]

println array1
println array2
array_copier.copy(array1,array2)
println array2


array1 = [1,2,3,4,5,6,7,8,9]
array2 = [9,8,7,6,5]
println array1
println array2
array_copier.copy(array1,array2)
println array2

array1 = [9,8,7,6,5]
array2 = [1,2,3,4,5,6,7,8,9]
println array1
println array2
array_copier.copy(array1,array2)
println array2
