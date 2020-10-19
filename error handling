package main
import "fmt"
import "os"

//function accepts a filename and tries to open it.
func fileopen(name string) {
    f, er := os.Open(name)

    //er will be nil if the file exists else it returns an error object  
    if er != nil {
        fmt.Println(er)
        return
    }else{
    	fmt.Println("file opened", f.Name())
    }
}

func main() {  
    fileopen("invalid.txt")
}
