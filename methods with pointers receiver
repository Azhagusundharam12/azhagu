package main

import (
	"fmt"
)

type Point struct {
	X, Y float64
}

func (p *Point) Translate(dx, dy float64) {
	p.X = p.X + dx
	p.Y = p.Y + dy
}

func main() {
	p := Point{3, 4}
	fmt.Println("Point p = ", p)

	p.Translate(7, 9)
	fmt.Println("After Translate, p = ", p)
}
