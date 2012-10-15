package lecture03
java.util.Scanner sc = new java.util.Scanner(System.in);
print "Please enter you string: "
def line = sc.nextLine() as String
def chosen_letters = []

while(true)
{
    print "Which letter would you like to count now?: "
    def letter = sc.next() as String
    if(chosen_letters.contains(letter))
    {
        println "Repeated character. Exiting the program..."
        break
    }
    chosen_letters.add(letter)
    count_letter(line, letter)
}

def count_letter(def input, def letter){
    def count = 0
    
    for(def i = 0; i < input.size(); ++i)
    {
        if(input[i] == letter)
            ++count 
    }
    println "Number of "+letter+"'s: " + count
}
