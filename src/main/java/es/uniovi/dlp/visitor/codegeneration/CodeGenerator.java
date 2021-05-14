package es.uniovi.dlp.visitor.codegeneration;


import es.uniovi.dlp.ast.types.CharType;
import es.uniovi.dlp.ast.types.DoubleType;
import es.uniovi.dlp.ast.types.IntType;
import es.uniovi.dlp.ast.types.Type;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class CodeGenerator {
    private OutputStreamWriter out;
    private int labelCounter;
    private int actualLine;

    public CodeGenerator(OutputStreamWriter out) {
        this.out = out;
    }

    public void source(String constant) {
        writeInstruction("#source " + '"' + constant + '"' + "\n");
    }

    public void line(int constant) {
        if (constant == actualLine)
            return;
        actualLine = constant;
        writeInstruction("#line " + constant + "\n");
    }

    public void push(String type, int n) {
        writeInstruction("\tpush" + type + "\t" + n + "\n");
    }

    public void push(String type, double n) {
        writeInstruction("\tpush" + type + "\t" + n + "\n");
    }


    public void pusha(int i) {
        writeInstruction("\tpusha\t" + i + "\n");
    }

    public void pushBp() {

        writeInstruction("\tpush\tbp\n");


    }

    public void load(String type) {

        writeInstruction("\tload" + type + "\n");


    }

    public void store(String type) {

        writeInstruction("\tstore" + type + "\n");


    }

    public void pop(String type) {

        writeInstruction("\tpop" + type + "\n");


    }

    public void dup(String type) {

        writeInstruction("\tdup" + type + "\n");


    }

    public void b2i() {

        writeInstruction("\tb2i\n");


    }

    public void i2f() {

        writeInstruction("\ti2f\n");


    }

    public void f2i() {

        writeInstruction("\tf2i\n");


    }

    public void i2b() {

        writeInstruction("\ti2b\n");


    }

    public void out(String b) {

        writeInstruction("\tout" + b + "\n");


    }

    public void in(String x) {

        writeInstruction("\tin" + x + "\n");


    }


    public void jmp(int label) {

        writeInstruction("\tjmp\t label" + label + "\n");


    }

    public void jz(int label) {

        writeInstruction("\tjz\t label" + label + "\n");


    }

    public void jnz(int label) {

        writeInstruction("\tjnz" + label + "\n");


    }

    public int getLabel() {
        return labelCounter++;
    }

    public void halt() {

        writeInstruction("halt\n");


    }

    public void call(String etiqueta) {

        writeInstruction("call " + etiqueta + "\n");


    }


    public void enter(int i) {
        writeInstruction("\tenter " + i + "\n");
    }

    public void ret(int retBytes, int retVar, int retPar) {
        writeInstruction("\tret " + retBytes + "," + retVar + "," + retPar + "\n");
    }

    public void add(String type) {

        writeInstruction("\tadd" + type + "\n");


    }

    public void sub(String type) {

        writeInstruction("\tsub" + type + "\n");


    }

    public void div(String type) {

        writeInstruction("\tdiv" + type + "\n");


    }

    public void mul(String type) {

        writeInstruction("\tmul" + type + "\n");


    }

    public void mod(String type) {

        writeInstruction("\tmod" + type + "\n");


    }

    public void gt(String type) {

        writeInstruction("\tgt" + type + "\n");


    }

    public void lt(String type) {

        writeInstruction("\tlt" + type + "\n");


    }

    public void ge(String type) {

        writeInstruction("\tge" + type + "\n");


    }

    public void le(String type) {

        writeInstruction("\tle" + type + "\n");


    }

    public void eq(String type) {

        writeInstruction("\teq" + type + "\n");


    }

    public void ne(String type) {

        writeInstruction("\tne" + type + "\n");


    }

    public void and() {

        writeInstruction("\tand\n");


    }

    public void or() {

        writeInstruction("\tor\n");


    }

    public void not() {

        writeInstruction("\tnot\n");


    }

    public void logic(String operator) {

        switch (operator) {
            case "&&":
                and();
                break;
            case "||":
                or();
                break;
            case "!":
                not();
                break;
            default:
                break;
        }

    }

    public void arithmetic(String operator, String type) {

        switch (operator) {
            case "+":
                add(type);
                break;
            case "-":
                sub(type);
                break;
            case "*":
                mul(type);
                break;
            case "/":
                div(type);
                break;
            case "%":
                mod(type);
                break;
            default:
                break;
        }

    }

    public void comparison(String operator, String type) {

        switch (operator) {
            case ">":
                gt(type);
                break;
            case "<":
                lt(type);
                break;
            case ">=":
                ge(type);
                break;
            case "<=":
                le(type);
                break;
            case "==":
                eq(type);
                break;
            case "!=":
                ne(type);
                break;
            default:
                break;
        }

    }

    public void id(String name) {

        writeInstruction(name + ":" + "\n");


    }

    public void comment(String name) {

        writeInstruction(name + "\n");


    }

    public void promoteTo(Type left, Type right) {
        if (left instanceof CharType) {
            if (right instanceof DoubleType) {
                b2i();
                i2f();
            }
            if (right instanceof IntType) b2i();
        }
        if (left instanceof IntType) {
            if (right instanceof DoubleType) i2f();
            if (right instanceof CharType) i2b();
        }
        if (left instanceof DoubleType) {
            if (right instanceof IntType) i2f();
            if (right instanceof CharType) {
                f2i();
                i2b();
            }
        }

    }


    public void writeInstruction(String e) {
        try {
            out.write(e);
            out.flush();
        } catch (
                Exception ex) {

        }
    }
}
