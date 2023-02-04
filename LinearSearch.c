#include <stdio.h>
int LinearSearch(int arr[], int length)
{
    int target;
    scanf("%d", &target);
    for (int index = 0; index < length; index++)
    {
        if (arr[index] == target)
        {
            printf("Number/index is found ");
            return index;
        }
    }
    printf("Number/index is not found in an array ");
    return -1;
}
int main()
{
    int array[] = {5, 1, 3, 8, 51, 5, 4};
    // int target=4;
    printf("Enter the number to find it index:\n");

    int length = sizeof(array) / sizeof(array[0]);
    int ans = LinearSearch(array, length);
    printf("%d", ans);
    return 0;
}