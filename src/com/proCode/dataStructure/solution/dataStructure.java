package com.proCode.dataStructure.solution;

import java.util.*;

public class dataStructure {
    /*
    1. Array
    문제: 정수 배열이 주어질 때, 가장 큰 두 수의 합을 반환하시오.
    예: [1, 9, 3, 7, 5] → 9 + 7 = 16
    * */
    public static void main(String[] args) {
        // array();
        // list();
        // addString();
        // BackToTheFuture();
        // sameElement(); 얜좀 풀이 길었다.
        // checkedSpellings();
        // NoDuplicateCount();
        //AverageStudentScore();
        sortArray();
    }

    private static void sortArray() {
        // 사용자로부터 숫자를 입력 받아 저장한 뒤, 오름차순으로 정렬하여 출력하시오
        // 흠.. 그냥 list를 활용해서 list의 특징 중복을 허용하고 순서를 보장하지 않는다 인데
        // list에 add 해서 sort를 사용하면 되지 않을까? 일단 오름차순은 sort 인데 ... 아님 뭐 로직을 for문 이용해서 짜면 되긴하지만
        // 사실 sort에 대해 잘 모르니까 빠르게 공식문서를 확인해 보자
        // 내가 일단 확인해본결과 java.util에서 Arrays 에서도 사용이 가능하네
        //Arrays arrays = new Arrays(); // 이렇게 하려니 안되네
        ArrayList<Integer> list = new ArrayList<>(); // -> 내가아는건 ArrayList인데 Arrays랑은 다른건가?
        while(true){
            Scanner sc = new Scanner(System.in);

            String s = sc.nextLine();
            if(s.equals("exit")){
                break;
            }
            list.add(Integer.parseInt(s));
        }
        Collections.sort(list);
        System.out.println(list); // 근데 또 왜 여기서는 sort가 안되는거지.///?
        // 다시 찾아보니 sort 안에 int[] a 나 이런게 들어간다 그러면 단순 배열로 해야하는건가?

    }

    private static void AverageStudentScore() {
        // 입력 받은 학생 이름과 점수를 입력 받아 저장하고, 평균 점수를 구하시오.
        Scanner sc = new Scanner(System.in);
        System.out.println("학생 이름을 적으시오 : ");
        String studentName = sc.nextLine();
        System.out.println("시험을 본 점수들을 적으시오 : ");
        System.out.println("종료 시 \"exit\" 입력");
        List<Integer> scoreList = new ArrayList<>();
        while (true) {
            String input = sc.nextLine();
            if (input.equals("exit")) {
                break;
            }
            scoreList.add(Integer.parseInt(input));
        }
        // 여기까지가 문제 조건부 완성 이후 평균점수 구하기
        // 평균을 구하는 방법 -> 평균 = 전체 점수합/점수의 개수
        double average = 0; // 평균점수 소수로 나올 수 있음
        for (Integer integer : scoreList) {
            average += integer;
        }
        average /= scoreList.size();
        System.out.println(studentName+"의 평균 시험 점수는 : "+average+"점 입니다.");
    }

    private static void NoDuplicateCount() {
        // 정수 배열에서 중복없이 고유한 숫자의 개수를 출력
        // 일단 이건 중복없이 라는 키워드가 있으므로 set or Map을 사용해야 함
        // 그냥 이건 size를 활용하면 되는거 아닌가?
        Scanner sc = new Scanner(System.in);
        String numArray = sc.nextLine();
        String[] arr = numArray.split(",");
        int[] array = new int[arr.length];
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            array[i] = Integer.parseInt(arr[i]);
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            map.put(array[i], i);
        }
        for(int i=0; i <map.size(); i++){
            count++;
        }
        System.out.println(count);
        // 개선 사항
        // 1. count 는 사실 = map.size()와 동일 -> count를 증가 시키는 코드 불필요
        // 2. set으로 했으면 더 간결 해짐

    }

    private static void checkedSpellings() {
        // 문자열이 주어 졌을 때 각 알파벳이 몇 번 나왔나 확인
        // ex) apple {a=1,p=2,l=1,e=1}

        /*
        일단 이건 순서와 흐름제어가 필요 하다 생각
        흐름제어 중 값의 비교가 필요
        -> 따라서 여기서 stack or queue를 사용하면 적절 하지 않을 까 생각
        ex) 각 문자열 배열을 순회 하며 아 아닌가 결국 문자열 안을 순회 해야하는거면 이것 또한 set이 효율적인거 아닌가?
        set을 통해서 해당 인덱스가 contains 를 하는지 똑같이 확인하고 존재 한다면 count+1 이런 식으로?
        흠... 일단 해보자
        */
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String[] words = word.split("");
        System.out.println(Arrays.toString(words));

        // 각 스펠링에 해당하는 수를 저장하기 위함 -> key value가 좋을 듯
        Map<String, Integer> map = new LinkedHashMap<>();
        // 첫 번째 set으로 접근 해보자
        for(int i = 0; i<words.length; i++){
            // 처음에 아무것도 없거나 중복되는게 없는 경우 그냥 set에 추가 map에도 해당 스펠링에대해 기본 count로 value 저장
            if(map.containsKey(words[i])){
                map.put(words[i], map.get(words[i])+1);
            }else{
                map.put(words[i],1);
            }
        }
        for(String i : map.keySet()){
            System.out.println(i);
            System.out.println(i + "=" + map.get(i));
        }
        // 일단 위에 내가 생각한 풀이의 문제점
        /*
        1. set은 단순 중복 방지용으로 더 적합 하기 때문에 여기서는 불필요
        2. map을 사용하는 방법은 좋았으나 활용 방법을 수정
        3. count를 전역 변수로 설정함에 따라 증가가 되면 그 뒤에 값들도 증가하게 됨
        * */
    }

    private static void sameElement() {
        // 두 정수의 배열을 입력 받고 공통된 원소를 출력해라

        // 여기 부터
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first element");
        String first = sc.nextLine();
        System.out.println("Enter the second element");
        String second = sc.nextLine();

        // 문자열 배열로 변환
        String[] arr1 = first.split(",");
        String[] arr2 = second.split(",");

        // 문자열 배열의 길이 만큼 정수 배열 생성
        int[] array1 = new int[arr1.length];
        int[] array2 = new int[arr2.length];

        // 변환
        for (int i = 0; i < arr1.length; i++) {
            array1[i] = Integer.parseInt(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            array2[i] = Integer.parseInt(arr2[i]);
        }
        // 여기까지해서  입력을 받은 것을 정수의 배열로 만듬
        // 생각 해보기
        // 공통된 원소만 출력을 해야함
        // stack을 활용해서 첫번째 배열 부터 push를 하고
        // 만약 같은 원소가 들어오면 마지막 원소 pop 후 해당 인덱스 저장
        // 근데 stack의 특징을 생각해보자 : 선형구조로 중복 허용 o, 후입 선출
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        // 근데 생각해보니 satck에 push 를 해도 그 값을 비교를 어떻게 하지..?
        // 공식문서에는 contains가 있는 거같은데
        for (int j : array1) {
            stack.push(j);
        }
        for (int i = 0; i < array2.length; i++) {
            if (stack.contains(array2[i])) {
                list.add(array2[i]);
            }
        }
        System.out.println(list);
        // 일단 제미나이 답변 : Stack으로 했을 때 contain를 하면 내부에서 찾는데 시간 복잡도가 O(n*m) 이므로 배열이 켜질 경우 오래걸림
        // set을 활용하여 contain을 하여 O(1)의 시간복잡도 활용
        // -> 확인 결과 stack은 순서와 비교를 할 때 사용 내부의 값을 찾을 때는 set이 유용
        // 이유 : set에는 hashcode가 존재 하기 때문에 값들에 접근이 빠름
        Set<Integer> set = new HashSet<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(array1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(array2[i])) {
                list2.add(array2[i]);
            }
        }
        System.out.println(list2);
    }

    private static void BackToTheFuture() {
        // 페이지 방문기록 저장 -> 뒤로가기 -> 이전 페이지 돌아감
        // 사실 실제 웹 브라우저에서는 캐시를 활용하여 정보를 기억하고 그 정보로 돌아가는걸로 알고 있음
        // but 알고리즘 측면에서는 후입선출의 특징을 가지고 있는 stack으로 접근
        // stack에 페이지1이라는 여기서는 문자열로 정보 받기
        // 근데 문제 예시 보여준거에 "페이지1 → 페이지2 → 뒤로가기 → 페이지3" → [페이지1, 페이지3] 이렇게 되어있는데
        // 뒤로가기 했으면 페이지 2가 되어야 하는거아니야? (아 뭔지 알겠다 페이지 2에서 뒤로가기가 된거구나
        // 즉 페이지2를 pop한다고 생각
        // stack의 특징 : 스택은 선형 구조로 중복을 허용하고 후입 선출의 특징을 가지고 있음
        // 아마 길이 제한은 없는 걸로 알고 있고 stack은 Collection의 인터페이스가 아니다?
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        // do while 을 통해 뒤로가기 이후 다음 페이지로 이동하는거까지
        do {
            String s = sc.nextLine();
            if (s.equals("뒤로가기")) {
                stack.pop();
                break;
            }
            stack.push(s);
        } while (true);
        System.out.println(stack);
    }

    private static void addString() {
        Scanner sc = new Scanner(System.in);
        // 문자열을 계속 입력 받아야함 -> 무한 loop
        // 문자열을 계속 추가한다? = 리스트의 특징 중 1개 길이의 제한이 없고 중복을 허용한다.
        // 그랬을 때 내 생각 1. 단순 리스트 추가 2. map을 생각했는데 생각해 보니 Map은 중복 허용 X
        // 1 번 채택
        List<String> list = new ArrayList<>();
        while (true) {

            String s = sc.nextLine();
            if (s.equals("exit")) {
                break;
            }
            // 번외 : 여기서 인텔리제이가 sc. 만해도 hashnextLine 을 자동완성하려는데 이게 뭔지
            list.add(s);
        }
        System.out.println(list);
    }

    private static void list() {
        // 문제 : 중복을 제거한 리스트 반환
        int[] ex = {1, 2, 2, 3, 4, 4};
        // 풀이 : set은 중복 허용 x 길이 제한 있음
        Set<Integer> set = new HashSet<>();
        for (int i : ex) {
            set.add(i);
        }
        // 다시 List 화
        List<Integer> resultList = new ArrayList<>(set);
        System.out.println(resultList);
    }

    private static void array() {
        int[] arr = {1, 9, 3, 7, 5};
        // 내 생각 일단 배열의 특성 상 배열의 값을 찾기 위해서 O(n)의 시간 복잡도
        // 뭐 sort 랑 이런거? 있는거 같은데 이건 뭐였는지 다시 확인
        // -> 이거 Array.sort 임

//        int max = arr[0];
//        int nextMax = arr[0]; -> 이렇게 했을 경우 같은 값을 가지는 오류가 생길 수 있음
        int max = Integer.MIN_VALUE;
        int nextMax = Integer.MIN_VALUE;
        // 일단 최대값을 찾음
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                nextMax = max;
                max = arr[i];
            } else if (nextMax < arr[i] && arr[i] != max) {
                nextMax = arr[i];
            }
        }
        // 이후 최댓값 제거? 라고 생각하긴 하는데
        // 배열의 특성상 추가나 제거가 맨끝이나 처음이 아니면 힘듦
        // 해서 그냥 위에서 최대값을 찾고 next최대값을 찾음
        System.out.println(max + nextMax);
    }
}
