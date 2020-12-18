package com.dawool;

import java.util.ArrayList;

class kko2 {
    public long solution(String expression) {
        final ArrayList<Long> numbers = new ArrayList<Long>();
        final ArrayList<Character> operators = new ArrayList<Character>();

        long answer = 0;

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '*') {
                operators.add(expression.charAt(i));
                numbers.add(Long.parseLong(stringBuilder.toString()));
                stringBuilder.setLength(0);
            } else {
                stringBuilder.append(expression.charAt(i));
            }
        }
        numbers.add(Long.parseLong(stringBuilder.toString()));

        answer = Math.max(answer, pmt(numbers, operators));
        answer = Math.max(answer, ptm(numbers, operators));
        answer = Math.max(answer, mpt(numbers, operators));
        answer = Math.max(answer, mtp(numbers, operators));
        answer = Math.max(answer, tpm(numbers, operators));
        answer = Math.max(answer, tmp(numbers, operators));

        return answer;
    }

    public long pmt(ArrayList<Long> numbers, ArrayList<Character> operators) {
        ArrayList<Long> numbersT = new ArrayList<Long>(numbers);
        ArrayList<Character> operatorsT = new ArrayList<Character>(operators);

        while (operatorsT.contains('+')) {
            for (int i = 0; i < operatorsT.size(); i++) {
                if (operatorsT.get(i) == '+') {
                    numbersT.set(i, numbersT.get(i) + numbersT.get(i + 1));
                    numbersT.remove(i + 1);
                    operatorsT.remove(i);
                    break;
                }
            }
        }
        while (operatorsT.contains('-')) {
            for (int i = 0; i < operatorsT.size(); i++) {
                if (operatorsT.get(i) == '-') {
                    numbersT.set(i, numbersT.get(i) - numbersT.get(i + 1));
                    numbersT.remove(i + 1);
                    operatorsT.remove(i);
                    break;
                }
            }
        }
        while (operatorsT.contains('*')) {
            for (int i = 0; i < operatorsT.size(); i++) {
                if (operatorsT.get(i) == '*') {
                    numbersT.set(i, numbersT.get(i) * numbersT.get(i + 1));
                    numbersT.remove(i + 1);
                    operatorsT.remove(i);
                    break;
                }
            }
        }

        return Math.abs(numbersT.get(0));
    }

    public long ptm(ArrayList<Long> numbers, ArrayList<Character> operators) {
        ArrayList<Long> numbersT = new ArrayList<Long>(numbers);
        ArrayList<Character> operatorsT = new ArrayList<Character>(operators);
        while (operatorsT.contains('+')) {
            for (int i = 0; i < operatorsT.size(); i++) {
                if (operatorsT.get(i) == '+') {
                    numbersT.set(i, numbersT.get(i) + numbersT.get(i + 1));
                    numbersT.remove(i + 1);
                    operatorsT.remove(i);
                    break;
                }
            }
        }
        while (operatorsT.contains('*')) {
            for (int i = 0; i < operatorsT.size(); i++) {
                if (operatorsT.get(i) == '*') {
                    numbersT.set(i, numbersT.get(i) * numbersT.get(i + 1));
                    numbersT.remove(i + 1);
                    operatorsT.remove(i);
                    break;
                }
            }
        }
        while (operatorsT.contains('-')) {
            for (int i = 0; i < operatorsT.size(); i++) {
                if (operatorsT.get(i) == '-') {
                    numbersT.set(i, numbersT.get(i) - numbersT.get(i + 1));
                    numbersT.remove(i + 1);
                    operatorsT.remove(i);
                    break;
                }
            }
        }

        return Math.abs(numbersT.get(0));
    }

    public long mpt(ArrayList<Long> numbers, ArrayList<Character> operators) {
        ArrayList<Long> numbersT = new ArrayList<Long>(numbers);
        ArrayList<Character> operatorsT = new ArrayList<Character>(operators);
        while (operatorsT.contains('-')) {
            for (int i = 0; i < operatorsT.size(); i++) {
                if (operatorsT.get(i) == '-') {
                    numbersT.set(i, numbersT.get(i) - numbersT.get(i + 1));
                    numbersT.remove(i + 1);
                    operatorsT.remove(i);
                    break;
                }
            }
        }
        while (operatorsT.contains('+')) {
            for (int i = 0; i < operatorsT.size(); i++) {
                if (operatorsT.get(i) == '+') {
                    numbersT.set(i, numbersT.get(i) + numbersT.get(i + 1));
                    numbersT.remove(i + 1);
                    operatorsT.remove(i);
                    break;
                }
            }
        }
        while (operatorsT.contains('*')) {
            for (int i = 0; i < operatorsT.size(); i++) {
                if (operatorsT.get(i) == '*') {
                    numbersT.set(i, numbersT.get(i) * numbersT.get(i + 1));
                    numbersT.remove(i + 1);
                    operatorsT.remove(i);
                    break;
                }
            }
        }

        return Math.abs(numbersT.get(0));
    }

    public long mtp(ArrayList<Long> numbers, ArrayList<Character> operators) {
        ArrayList<Long> numbersT = new ArrayList<Long>(numbers);
        ArrayList<Character> operatorsT = new ArrayList<Character>(operators);
        while (operatorsT.contains('-')) {
            for (int i = 0; i < operatorsT.size(); i++) {
                if (operatorsT.get(i) == '-') {
                    numbersT.set(i, numbersT.get(i) - numbersT.get(i + 1));
                    numbersT.remove(i + 1);
                    operatorsT.remove(i);
                    break;
                }
            }
        }
        while (operatorsT.contains('*')) {
            for (int i = 0; i < operatorsT.size(); i++) {
                if (operatorsT.get(i) == '*') {
                    numbersT.set(i, numbersT.get(i) * numbersT.get(i + 1));
                    numbersT.remove(i + 1);
                    operatorsT.remove(i);
                    break;
                }
            }
        }
        while (operatorsT.contains('+')) {
            for (int i = 0; i < operatorsT.size(); i++) {
                if (operatorsT.get(i) == '+') {
                    numbersT.set(i, numbersT.get(i) + numbersT.get(i + 1));
                    numbersT.remove(i + 1);
                    operatorsT.remove(i);
                    break;
                }
            }
        }

        return Math.abs(numbersT.get(0));
    }

    public long tpm(ArrayList<Long> numbers, ArrayList<Character> operators) {
        ArrayList<Long> numbersT = new ArrayList<Long>(numbers);
        ArrayList<Character> operatorsT = new ArrayList<Character>(operators);
        while (operatorsT.contains('*')) {
            for (int i = 0; i < operatorsT.size(); i++) {
                if (operatorsT.get(i) == '*') {
                    numbersT.set(i, numbersT.get(i) * numbersT.get(i + 1));
                    numbersT.remove(i + 1);
                    operatorsT.remove(i);
                    break;
                }
            }
        }
        while (operatorsT.contains('+')) {
            for (int i = 0; i < operatorsT.size(); i++) {
                if (operatorsT.get(i) == '+') {
                    numbersT.set(i, numbersT.get(i) + numbersT.get(i + 1));
                    numbersT.remove(i + 1);
                    operatorsT.remove(i);
                    break;
                }
            }
        }
        while (operatorsT.contains('-')) {
            for (int i = 0; i < operatorsT.size(); i++) {
                if (operatorsT.get(i) == '-') {
                    numbersT.set(i, numbersT.get(i) - numbersT.get(i + 1));
                    numbersT.remove(i + 1);
                    operatorsT.remove(i);
                    break;
                }
            }
        }

        return Math.abs(numbersT.get(0));
    }

    public long tmp(ArrayList<Long> numbers, ArrayList<Character> operators) {
        ArrayList<Long> numbersT = new ArrayList<Long>(numbers);
        ArrayList<Character> operatorsT = new ArrayList<Character>(operators);
        while (operatorsT.contains('*')) {
            for (int i = 0; i < operatorsT.size(); i++) {
                if (operatorsT.get(i) == '*') {
                    numbersT.set(i, numbersT.get(i) * numbersT.get(i + 1));
                    numbersT.remove(i + 1);
                    operatorsT.remove(i);
                    break;
                }
            }
        }
        while (operatorsT.contains('-')) {
            for (int i = 0; i < operatorsT.size(); i++) {
                if (operatorsT.get(i) == '-') {
                    numbersT.set(i, numbersT.get(i) - numbersT.get(i + 1));
                    numbersT.remove(i + 1);
                    operatorsT.remove(i);
                    break;
                }
            }
        }
        while (operatorsT.contains('+')) {
            for (int i = 0; i < operatorsT.size(); i++) {
                if (operatorsT.get(i) == '+') {
                    numbersT.set(i, numbersT.get(i) + numbersT.get(i + 1));
                    numbersT.remove(i + 1);
                    operatorsT.remove(i);
                    break;
                }
            }
        }

        return Math.abs(numbersT.get(0));
    }
}