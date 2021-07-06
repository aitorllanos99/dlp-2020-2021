#source "correcto.xana"
' reg1 :: record((a x char) x (b x int) x (c x double))( offset 0 )
' reg2 :: [5 :: record((a x char) x (b x int) x (c x double))]( offset 7 )
' reg3 :: record((b x int))( offset 42 )
' reg4 :: record((a x [10 :: char]) x (b x int) x (c x record((a x int))))( offset 44 )
' reg5 :: record((a x int) x (b x record((x x double) x (y x char) x (z x char))) x (c x double))( offset 58 )
' reg6 :: record((b x record((y x char))))( offset 70 )
' Invocation to the main function
call main
halt
#line 37
init:
' Parameters
' Local variables
	enter 0
#line 38
	pusha	7
	pushi	0
	pushi	7
	muli
	addi
	pushi	0
	addi
	pushb	97
	storeb
#line 39
	pusha	7
	pushi	0
	pushi	7
	muli
	addi
	pushi	1
	addi
	pushi	1
	storei
#line 40
	pusha	7
	pushi	0
	pushi	7
	muli
	addi
	pushi	3
	addi
	pushf	2.2
	storef
#line 42
	pusha	42
	pushi	0
	addi
	pushi	3
	storei
#line 43
	pusha	70
	pushi	0
	addi
	pushi	0
	addi
	pushb	98
	storeb
#line 46
	pusha	0
	pushi	0
	addi
	pushb	98
	storeb
#line 47
	pusha	0
	pushi	1
	addi
	pushi	2
	storei
#line 48
	pusha	0
	pushi	3
	addi
	pushf	4.4
	storef
	ret 0,0,0
#line 51
main:
' Parameters
' Local variables
	enter 0
#line 52
call init
#line 54
' Register Assignment
	pusha	0
	pushi	0
	addi
	pusha	7
	pushi	0
	pushi	7
	muli
	addi
	pushi	0
	addi
	loadb
	storeb
	pusha	0
	pushi	1
	addi
	pusha	7
	pushi	0
	pushi	7
	muli
	addi
	pushi	1
	addi
	loadi
	storei
	pusha	0
	pushi	3
	addi
	pusha	7
	pushi	0
	pushi	7
	muli
	addi
	pushi	3
	addi
	loadf
	storef
#line 55
' Register Assignment
	pusha	7
	pushi	0
	pushi	7
	muli
	addi
	pushi	0
	addi
	pusha	0
	pushi	0
	addi
	loadb
	storeb
	pusha	7
	pushi	0
	pushi	7
	muli
	addi
	pushi	1
	addi
	pusha	0
	pushi	1
	addi
	loadi
	storei
	pusha	7
	pushi	0
	pushi	7
	muli
	addi
	pushi	3
	addi
	pusha	0
	pushi	3
	addi
	loadf
	storef
#line 56
' Write
	pusha	0
	pushi	0
	addi
	loadb
	outb
' Write
	pushb	32
	outb
' Write
	pusha	0
	pushi	1
	addi
	loadi
	outi
' Write
	pushb	32
	outb
' Write
	pusha	0
	pushi	3
	addi
	loadf
	outf
' Write
	pushb	32
	outb
' Write
	pushb	10
	outb
#line 58
' Register Assignment
	pusha	0
	pushi	1
	addi
	pusha	42
	pushi	0
	addi
	loadi
	storei
#line 59
' Register Assignment
	pusha	7
	pushi	1
	pushi	7
	muli
	addi
	pushi	1
	addi
	pusha	42
	pushi	0
	addi
	loadi
	storei
#line 60
' Write
	pusha	0
	pushi	1
	addi
	loadi
	outi
' Write
	pushb	32
	outb
' Write
	pusha	7
	pushi	1
	pushi	7
	muli
	addi
	pushi	1
	addi
	loadi
	outi
' Write
	pushb	10
	outb
#line 62
' Register Assignment
	pusha	44
	pushi	10
	addi
	pusha	42
	pushi	0
	addi
	loadi
	storei
#line 63
' Write
	pusha	44
	pushi	10
	addi
	loadi
	outi
' Write
	pushb	10
	outb
#line 65
' Register Assignment
	pusha	58
	pushi	2
	addi
	pushi	4
	addi
	pusha	70
	pushi	0
	addi
	pushi	0
	addi
	loadb
	storeb
#line 66
' Write
	pusha	58
	pushi	2
	addi
	pushi	4
	addi
	loadb
	outb
' Write
	pushb	10
	outb
	ret 0,0,0
