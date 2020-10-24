package com.dawool;

import java.util.Scanner;
import java.util.Stack;

class Main {
    private static void solution(int numOfOrder, String[] orderArr) {
        // TODO: 이곳에 코드를 작성하세요. 추가로 필요한 함수와 전역변수를 선언해서 사용하셔도 됩니다.
        Stack<String> orderStack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int order = 0; order < numOfOrder; order++) {
            int left = 0;
            int right;
            for (int c = 0; c < orderArr[order].length(); c++) {
                if (orderArr[order].charAt(c) == '(') {
                    right = c - 1;
                    StringBuilder strBuilder = new StringBuilder(orderArr[order].substring(left, right + 1));
                    String str = orderArr[order].substring(left, right + 1);

                    for (int i = 0; i < str.length() - 1; i++) {
                        if (str.charAt(i) >= 49 && str.charAt(i) <= 57) {
                            for (int j = 0; j < str.charAt(i) - 48; j++) {
                                strBuilder.append(str.charAt(i));
                            }
                        } else {
                            strBuilder.append(str.charAt(i));
                        }
                    }

                    if (!str.equals("")) {
                        orderStack.push(strBuilder.toString());
                    }
//                    System.out.println(str);
                    left = c + 1;

                } else if (orderArr[order].charAt(c) == ')') {
                    right = c - 1;
                    String str = orderArr[order].substring(left, right + 1);
                    left = c + 1;

//                    System.out.println(str);
                    String popedString = orderStack.pop();
                    if (!str.equals("") && str.charAt(str.length() - 1) >= 49 && str.charAt(str.length() - 1) <= 57) {
                        for (int i = 0; i < str.charAt(str.length() - 1) - 48; i++) {
                            String tempStr = orderStack.pop();
                            sb.append(tempStr);
                        }

                    } else if (!str.equals("") && str.charAt(str.length() - 1) == 'R') {
                        String tempStr = orderStack.pop();
                        for (int i = 0; i < tempStr.length(); i++) {
                            sb.append('R');
                            sb.append(tempStr.charAt(i));
                        }
                    } else if (!str.equals("") && str.charAt(str.length() - 1) == 'G') {
                        String tempStr = orderStack.pop();
                        for (int i = 0; i < tempStr.length(); i++) {
                            sb.append('G');
                            sb.append(tempStr.charAt(i));
                        }
                    } else if (!str.equals("") && str.charAt(str.length() - 1) == 'B') {
                        String tempStr = orderStack.pop();
                        for (int i = 0; i < tempStr.length(); i++) {
                            sb.append('B');
                            sb.append(tempStr.charAt(i));
                        }
                    } else {

                    }
                }
            }
            sb.append('\n');

        }
        System.out.println(sb);
    }

    private static class InputData {
        int numOfOrder;
        String[] orderArr;
    }

    private static InputData processStdin() {
        InputData inputData = new InputData();

        try (Scanner scanner = new Scanner(System.in)) {
            inputData.numOfOrder = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));

            inputData.orderArr = new String[inputData.numOfOrder];
            for (int i = 0; i < inputData.numOfOrder; i++) {
                inputData.orderArr[i] = scanner.nextLine().replaceAll("\\s+", "");
            }
        } catch (Exception e) {
            throw e;
        }

        return inputData;
    }

    public static void main(String[] args) throws Exception {
        InputData inputData = processStdin();

        solution(inputData.numOfOrder, inputData.orderArr);
    }
}