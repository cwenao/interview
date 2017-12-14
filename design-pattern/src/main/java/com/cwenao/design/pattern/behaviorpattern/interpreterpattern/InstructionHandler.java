/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.interpreterpattern;

import java.util.Stack;

/**
 * 构建抽象语法树
 * @author cwenao
 * @version $Id InstructionHandler.java, v 0.1 2017-12-14 10:39 cwenao Exp $$
 */
public class InstructionHandler {
    private AbstractNode instructNode;

    public void handler(String instruction) {
        // defined the sentence node
        AbstractNode left = null;
        AbstractNode right = null;

        //defined the other node
        AbstractNode direction = null;
        AbstractNode action = null;
        AbstractNode distance = null;

        Stack syntaxTree = new Stack();
        String[] words = instruction.split(" ");

        for (int i=0; i< words.length;i++) {
            if ("and".equalsIgnoreCase(words[i])) {
                left = (AbstractNode) syntaxTree.pop();
                direction = new DirectionNode(words[++i]);
                action = new ActionNode(words[++i]);
                distance = new DistanceNode(words[++i]);

                right = new SentenceNode(direction, action, distance);
                syntaxTree.push(new AndNode(left, right));

            } else {
                direction = new DirectionNode(words[i]);
                action = new ActionNode(words[++i]);
                distance = new DistanceNode(words[++i]);
                left = new SentenceNode(direction, action, distance);
                syntaxTree.push(left);
            }
        }
        this.instructNode = (AbstractNode) syntaxTree.pop();
    }

    public String output() {
        String result = instructNode.interpret();
        return result;
    }

}
