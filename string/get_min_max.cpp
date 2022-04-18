#include <iostream>
using namespace std;

void get_min_max(int src[], int n, int *max_v, int *min_v)
{
    *max_v = *min_v = src[0];

    for (int i = 0; i < n; i++)
    {
        if (src[i] > *max_v)
        {
            *max_v = src[i];
        }
        else if (src[i] < *min_v)
        {
            *min_v = src[i];
        }
    }
}

int main()
{
    int src[] = {1, 2, 3, 4, 5, 6};
    int max_v, min_v;
    int n = sizeof(src) / sizeof(src[0]);
    get_min_max(src, n, &max_v, &min_v);

    cout << "最大值为：" << max_v << endl;
    cout << "最小值为：" << min_v << endl;

    return 0;
}