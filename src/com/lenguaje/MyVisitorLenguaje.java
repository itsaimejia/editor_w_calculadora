package com.lenguaje;

import com.lenguaje.parser.LenguajeBaseVisitor;
import com.lenguaje.parser.LenguajeParser;
import java.util.ArrayList;
import java.util.List;

public class MyVisitorLenguaje extends LenguajeBaseVisitor<String> {
    public static List<String> newSentence = new ArrayList<>();
    @Override
    public String visitArchivo(LenguajeParser.ArchivoContext ctx) {
        System.out.println("__func initial():");
        newSentence.add("__func initial():");
        for (int i=0; i< ctx.body().size(); i++){
            newSentence.add(visit(ctx.body(i)));
            System.out.println(visit(ctx.body(i)));
        }
        newSentence.add("func__");
        System.out.println("func__");
        return null;
    }

    @Override
    public String visitDeclaracion(LenguajeParser.DeclaracionContext ctx) {
        return "tangananica "+ ctx.ID() +';';

    }

    @Override
    public String visitAsignacion(LenguajeParser.AsignacionContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitImpresion(LenguajeParser.ImpresionContext ctx) {
        return "tanganana(" + visit(ctx.expr()) + ");";
    }

    @Override
    public String visitNum(LenguajeParser.NumContext ctx) {
        return ctx.NUM().getText();
    }

    @Override
    public String visitId(LenguajeParser.IdContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitMultDiv(LenguajeParser.MultDivContext ctx) {
        String op = (ctx.op.getType() == LenguajeParser.MULT) ? "*":"/";
        return visit(ctx.expr(0)) + op + visit(ctx.expr(1));
    }

    @Override
    public String visitSumSub(LenguajeParser.SumSubContext ctx) {
        String op = (ctx.op.getType() == LenguajeParser.SUM) ? "+":"-";
        return visit(ctx.expr(0)) + op +visit(ctx.expr(1));
    }
}
