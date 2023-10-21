#include<stdio.h>
#include<vector>
int main(int argc, char* argv[])
{   
    std::vector<int> numbers;
    numbers.push_back(9);
    printf("%d\n",numbers.size());
    printf("ECHO:%s %d\n",argv[3],numbers[9]);
    return 0;
}