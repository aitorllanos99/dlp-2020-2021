#source "ex1.xana"
' a :: record((x x double) x (y x double))( offset 0 )
' b :: record((y x double) x (x x double))( offset 8 )
' c :: record((x x double) x (y x double) x (z x double))( offset 16 )
' p :: double( offset 28 )
' Invocation to the main function
call main
halt
#line 17
main:
' Parameters
' Local variables
	enter 0
#line 20
	pusha	0
	pushi	0
	addi
	pushi	0
	i2f
	storef
#line 21
	pusha	0
	pushi	4
	addi
	pushi	1
	i2f
	storef
#line 22
	pusha	8
	pushi	4
	addi
	pushi	4
	i2f
	storef
#line 23
	pusha	8
	pushi	0
	addi
	pushi	5
	i2f
	storef
#line 25
' Write
	pusha	0
	pushi	0
	addi
	loadf
	outf
#line 26
' Write
	pusha	0
	pushi	4
	addi
	loadf
	outf
' Write
	pushb	10
	outb
#line 27
' Write
	pusha	8
	pushi	4
	addi
	loadf
	outf
#line 28
' Write
	pusha	8
	pushi	0
	addi
	loadf
	outf
' Write
	pushb	10
	outb
#line 30
	pusha	28
	pusha	8
	pushi	0
	addi
	loadf
	storef
#line 33
	pusha	8
	pushi	0
	addi
	pusha	0
	pushi	4
	addi
	loadf
	storef
	pusha	8
	pushi	4
	addi
	pusha	0
	pushi	0
	addi
	loadf
	storef
#line 35
' Write
	pusha	0
	pushi	0
	addi
	loadf
	outf
#line 36
' Write
	pusha	0
	pushi	4
	addi
	loadf
	outf
' Write
	pushb	10
	outb
#line 37
' Write
	pusha	8
	pushi	4
	addi
	loadf
	outf
#line 38
' Write
	pusha	8
	pushi	0
	addi
	loadf
	outf
' Write
	pushb	10
	outb
	ret 0,0,0
