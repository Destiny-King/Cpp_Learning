#include <iostream>
using namespace std;
#include <vector>
#include <algorithm>

void func(int val)
{
    cout << val << endl;
}

void test()
{
    //创建容器对象
    vector<int> v;

    //向容器中放数据
    v.push_back(10);
    v.push_back(20);
    v.push_back(30);
    v.push_back(40);
    v.push_back(50);
    v.push_back(60);

    //通过迭代器遍历容器中的元素
    vector<int>::iterator itBegin = v.begin();
    vector<int>::iterator itEnd = v.end();

    //第一种遍历方式
    // cout << "vector = ";
    // while (itBegin != itEnd)
    // {
    //     cout << *itBegin << " ";
    //     itBegin++;
    // }
    // cout << endl;

    //第二种遍历方式
    // for (vector<int>::iterator it = v.begin(); it != v.end(); it++)
    // {
    //     cout << *it << endl;
    // }

    //第三种遍历方式，使用STL提供的标准遍历算法
    for_each(v.begin(), v.end(), func);
}

int main()
{
    test();
    return 0;
}