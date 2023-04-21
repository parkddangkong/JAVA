#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num1, int num2) {
    double answer = 0;
    if(0<num1&&num1<=100&&0<num2&&num2<=100){
       answer = num1 / (double)num2;
    }
    return answer*1000;
}