#include <iostream>
using namespace std;
#include <vector>
#include <string>

void test()
{
    //创建大容器
    vector<vector<int>> v;

    //创建小容器
    vector<int> v1;
    vector<int> v2;
    vector<int> v3;
    vector<int> v4;
    vector<int> v5;

    for (int i = 0; i < 5; i++)
    {
        //向小容器中添加数据
        v1.push_back(i + 1);
        v2.push_back(i + 6);
        v3.push_back(i + 11);
        v4.push_back(i + 16);
        v5.push_back(i + 21);
    }

    //向大容器中添加数据
    v.push_back(v1);
    v.push_back(v2);
    v.push_back(v3);
    v.push_back(v4);
    v.push_back(v5);

    for (vector<vector<int>>::iterator it = v.begin(); it != v.end(); it++)
    {
        for (vector<int>::iterator vit = (*it).begin(); vit != (*it).end(); vit++)
        {
            cout << (*vit) << " ";
        }
        cout << endl;
    }
}

int main()
{
    test();
    return 0;
}