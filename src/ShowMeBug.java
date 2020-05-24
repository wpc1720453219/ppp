import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 现在程序中有一组学生成绩数据（getScoreList()返回结果），每条数据为某个学生的某科成绩。学生成绩可能不是4科都有，可能有缺科。要求对这组数据进行数据转换和计算处理，转换成学生记录列表，每条记录里面有4科成绩和总成绩，并在此基础上计算全班的平均成绩。最后用控制台输出即可，要求表格按总成绩从高到低排序。计算平均成绩时，缺课也算人次，结果保留三位小数，输出格式如下。
 需要注意的是，最终完成代码的代码质量（逻辑是否清晰，变量/方法命名是否合理等），将作为考察标准的一部分
 姓名		数学		语文		英语		物理		总成绩
 张三		 		  65	   84	     89	      316
 李四		 89		  76				 76		  313
 …	　	　	　	　	　
 平均成绩    83.5	 70.5	  78	    82.5	314.5
 */

public class ShowMeBug {
    static double[] courses = new double[5];

    public static void main(String[] args) {
        List<ScoreVo> scoreList = getScoreList();
        // TODO 请编写代码实现题目要求
        StudentVo studentVo;
        List<StudentVo> studentList = new ArrayList<>();
        List<String> list = new ArrayList<String>();
        for (ScoreVo scoreVo : scoreList) {
            list.add(scoreVo.studentName);
        }
        List<String> listTemp = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            if (!listTemp.contains(list.get(i))) {
                listTemp.add(list.get(i));
            }
        }
        ShowMeBug showMeBug = new ShowMeBug();
        int n = listTemp.size();
        for (int j = 0; j < n; j++) {
            studentVo = showMeBug. new StudentVo();
            double count = 0.0;
            for (int i = 0; i < scoreList.size(); i++) {
                if (scoreList.get(i).studentName.equals(listTemp.get(j))) {
                    studentVo.setName(listTemp.get(j));
                    if (scoreList.get(i).courseName.equals("语文")) {
                        studentVo.setChineseScore(scoreList.get(i).score);
                        count += scoreList.get(i).score;
                    }
                    if (scoreList.get(i).courseName.equals("数学")) {
                        studentVo.setMathScore(scoreList.get(i).score);
                        count += scoreList.get(i).score;
                    }
                    if (scoreList.get(i).courseName.equals("英语")) {
                        studentVo.setEnglishScore(scoreList.get(i).score);
                        count += scoreList.get(i).score;
                    }
                    if (scoreList.get(i).courseName.equals("物理")) {
                        studentVo.setPhysicalScore(scoreList.get(i).score);
                        count += scoreList.get(i).score;
                    }
                    studentVo.setTotalScore(count);
                }
            }
            courses[0] += studentVo.getMathScore() / n;
            courses[1] += studentVo.getChineseScore() / n;
            courses[2] += studentVo.getEnglishScore() / n;
            courses[3] += studentVo.getPhysicalScore() / n;
            courses[4] += studentVo.getTotalScore() / n;
            studentList.add(studentVo);
        }
        Collections.sort(studentList, new Comparator<StudentVo>() {

            @Override
            public int compare(StudentVo o1, StudentVo o2) {
                int i = (int)(o2.getTotalScore() - o1.getTotalScore());
                return i;
            }
        });

        System.out.println("姓名" + "\t" + "数学" + "\t" + "语文" + "\t" + "英语" + "\t" + "物理" + "\t" + "总成绩");
        for (StudentVo student : studentList) {
            System.out.println(student.getName() + "\t" + student.getMathScore()
                    + " \t" + student.getChineseScore() + "\t" + student.getEnglishScore() + "\t"
                    + student.getPhysicalScore() + "\t" + student.getTotalScore());
        }
        System.out.println("平均成绩"+courses[0]+"\t"+courses[1]+"\t"+courses[2]+"\t"+courses[3]+"\t"+courses[4]);
    }


    public static List<ScoreVo> getScoreList() {
        List<ScoreVo> scoreList = new ArrayList<ScoreVo>();
        ShowMeBug showMeBug = new ShowMeBug();
        scoreList.add(showMeBug.new ScoreVo("张三", "语文", 80));
        scoreList.add(showMeBug.new ScoreVo("张三", "物理", 76));
        scoreList.add(showMeBug.new ScoreVo("李四", "语文", 78));
        scoreList.add(showMeBug.new ScoreVo("茅十八", "英语", 65));
        scoreList.add(showMeBug.new ScoreVo("李四", "数学", 88));
        scoreList.add(showMeBug.new ScoreVo("李四", "物理", 87));
        scoreList.add(showMeBug.new ScoreVo("王五", "语文", 67));
        scoreList.add(showMeBug.new ScoreVo("张三", "数学", 76));
        scoreList.add(showMeBug.new ScoreVo("李四", "英语", 89));
        scoreList.add(showMeBug.new ScoreVo("王五", "数学", 65));
        scoreList.add(showMeBug.new ScoreVo("赵六", "物理", 95));
        scoreList.add(showMeBug.new ScoreVo("王五", "英语", 78));
        scoreList.add(showMeBug.new ScoreVo("王五", "物理", 65));
        scoreList.add(showMeBug.new ScoreVo("赵六", "语文", 89));
        scoreList.add(showMeBug.new ScoreVo("赵六", "英语", 87));
        scoreList.add(showMeBug.new ScoreVo("黄七", "语文", 78));
        scoreList.add(showMeBug.new ScoreVo("黄七", "数学", 65));
        scoreList.add(showMeBug.new ScoreVo("刘八", "英语", 87));
        scoreList.add(showMeBug.new ScoreVo("张三", "英语", 56));
        scoreList.add(showMeBug.new ScoreVo("黄七", "物理", 76));
        scoreList.add(showMeBug.new ScoreVo("刘八", "数学", 89));
        scoreList.add(showMeBug.new ScoreVo("黄七", "英语", 98));
        scoreList.add(showMeBug.new ScoreVo("刘八", "语文", 56));
        scoreList.add(showMeBug.new ScoreVo("刘八", "物理", 76));
        scoreList.add(showMeBug.new ScoreVo("钱九", "语文", 88));
        scoreList.add(showMeBug.new ScoreVo("钱九", "数学", 67));
        scoreList.add(showMeBug.new ScoreVo("茅十八", "数学", 43));
        scoreList.add(showMeBug.new ScoreVo("钱九", "英语", 75));
        scoreList.add(showMeBug.new ScoreVo("茅十八", "语文", 45));
        scoreList.add(showMeBug.new ScoreVo("茅十八", "物理", 56));

        return scoreList;

    }


    private class ScoreVo {
        public String studentName;
        public String courseName;
        public double score;

        public ScoreVo(String studentName, String courseName, double score) {
            this.studentName = studentName;
            this.courseName = courseName;
            this.score = score;
        }

        public String toString() {
            return this.studentName + "\t" + this.courseName + "\t" + this.score;
        }
    }

    private class StudentVo {
        private String name;
        private double chineseScore;
        private double mathScore;
        private double englishScore;
        private double physicalScore;
        private double totalScore;

        public StudentVo() {

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getChineseScore() {
            return chineseScore;
        }

        public void setChineseScore(double chineseScore) {
            this.chineseScore = chineseScore;
        }

        public double getMathScore() {
            return mathScore;
        }

        public void setMathScore(double mathScore) {
            this.mathScore = mathScore;
        }

        public double getEnglishScore() {
            return englishScore;
        }

        public void setEnglishScore(double englishScore) {
            this.englishScore = englishScore;
        }

        public double getPhysicalScore() {
            return physicalScore;
        }

        public void setPhysicalScore(double physicalScore) {
            this.physicalScore = physicalScore;
        }

        public double getTotalScore() {
            return totalScore;
        }

        public void setTotalScore(double totalScore) {
            this.totalScore = totalScore;
        }



    }
}
