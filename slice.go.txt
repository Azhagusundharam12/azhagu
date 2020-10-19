package main
import "fmt"
func main(){
	var num=[6]int{5,6,7,8,9,4}
	var s[]int=num[0:4]
	var p[]int=num[1:5]
	var c[]int=make([]int,3,10)
	fmt.Println(s)
	fmt.Println(p)
	fmt.Println("Len=",len(s))
	fmt.Println("cap=",cap(p))
	fmt.Printf("cap=%d len=%d",cap(c),len(c))
	p=append(p,1,2,3)
	fmt.Println(p)
	
}