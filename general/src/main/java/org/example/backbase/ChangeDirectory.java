package org.example.backbase;

import java.util.Objects;
import java.util.Stack;

public class ChangeDirectory {
    public String changeDirectoryString(String currentDirectory, String command) {
        String directoryCommand = validateAndGetDirectoryCommand(command);
        Stack<String> currentStack = getCurrentPathStack(currentDirectory, directoryCommand);
        buildPathFromCurrentStack(currentStack, directoryCommand);
        return getDirectoryStringFromStack(currentStack);
    }
    private String validateAndGetDirectoryCommand(String command) {
        if (command.isEmpty()) {
            throw new IllegalArgumentException();
        }
        String[] s = command.split(" ");
        if (s.length < 2) {
            throw new IllegalArgumentException();
        }
        if (!Objects.equals(s[0], "cd")) {
            throw new IllegalArgumentException();
        }

        return s[1];

    }
    private Stack<String> getCurrentPathStack(String currentDirectory, String directoryCommand) {
        Stack<String> currentStack = new Stack<>(); // for absolute directoryCommand
        if (!directoryCommand.startsWith("/")) {
            currentStack = buildStackForCurrentDirectory(currentDirectory);
        }
        return currentStack;
    }


    private void buildPathFromCurrentStack(Stack<String> currentDirectoryStack, String path) {
        String[] commands = path.split("/");
        for (int i = 0; i < commands.length; i++) {
            String current = commands[i];
            switch (current) {
                case "..": {
                    if (!currentDirectoryStack.isEmpty()) {
                        currentDirectoryStack.pop();
                    }
                    break;
                }
                case ".":
                case "":
                    break;
                default: {
                    currentDirectoryStack.push(current);
                }
            }
        }
    }
    private Stack<String> buildStackForCurrentDirectory(String currentDirectory) {
        String[] split = currentDirectory.split("/");
        Stack<String> stack = new Stack<>();
        for (String item : split) {
            if (!item.isEmpty()) {
                stack.push(item);
            }
        }
        return stack;
    }
    private String getDirectoryStringFromStack(Stack<String> stack) {
        StringBuilder stringBuilder = new StringBuilder("/");
        stack.forEach(item -> {
            stringBuilder.append(item);
            stringBuilder.append("/");
        });
        //remove last slash if duplicated.
        if (stringBuilder.length() > 1) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        return stringBuilder.toString();
    }

}
