import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

user_db = new UserDB()

def boolean addUser()
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
	print("Enter user Name: ")
	name = br.readLine() as String
	print("Enter a user ID: ")
	id = br.readLine() as int
	if(id == 0 || name == "")
		return false
	user_db.addUser(name, id)
	return true
	
}

running = true

while(running) 
{
	
	running = addUser()
}

println user_db.toString(2, 'S')