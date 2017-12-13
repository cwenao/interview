/**
 * Company
 * Copyright (C) 2014-2017 All Rights Reserved.
 */
package com.cwenao.design.pattern.behaviorpattern.commandpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cwenao
 * @version $Id ConfigSettingRequestor.java, v 0.1 2017-12-14 06:16 cwenao Exp $$
 */
public class ConfigSettingRequestor {
    private List<CommandPattern> commandPatternList = new ArrayList<>();
    private CommandPattern commandPattern;

    public void call(String cmd) {
        commandPattern.execute(cmd);
        commandPatternList.add(commandPattern);
    }

    public void save() {
        FileUtil.writeCommand(commandPatternList);
    }

    public void recover() {
        List<CommandPattern> commandPatterns;
        commandPatterns = FileUtil.readerCommand();

        for (CommandPattern command : commandPatterns) {
            command.execute();
        }

    }


    public CommandPattern getCommandPattern() {
        return commandPattern;
    }

    public void setCommandPattern(CommandPattern commandPattern) {
        this.commandPattern = commandPattern;
    }
}
