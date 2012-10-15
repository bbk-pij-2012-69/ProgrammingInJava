package lecture03
java.util.Scanner sc = new java.util.Scanner(System.in);
print "Please enter you string: "

def line = sc.nextLine() as String
count_letter(line, "e")

print "Which letter would you like to count?: "
def letter = sc.next() as String
count_letter(line, letter)

def count_letter(def input, def letter){
    def count = 0
    
    for(def i = 0; i < input.size(); ++i)
{
    if(input[i] == letter)
        ++count
}
    println "Number of "+letter+"'s: " + count
}
