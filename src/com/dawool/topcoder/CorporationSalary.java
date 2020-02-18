package com.dawool.topcoder;

public class CorporationSalary {
    private long salaries[];

    public long totalSalary(String[] relations) {
        salaries = new long[relations.length];

        long total = 0;
        for (int i = 0; i < relations.length; i++) {
            total += getSalary(i, relations);
        }

        return total;
    }

    private long getSalary(int i, String[] relations) {
        if (salaries[i] == 0) {
            long salary = 0;
            String relation = relations[i];

            for (int j = 0; j < relation.length(); j++) {
                if (relation.charAt(j) == 'Y') salary += getSalary(j, relations);
            }

            if (salary == 0) salary = 1;

            salaries[i] = salary;
        }

        return salaries[i];
    }
}
