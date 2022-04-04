#include <iostream>
using namespace std;
#include <vector>

class Person
{
private:
    /* data */
public:
    Person(string name, int age);
    ~Person();

    string m_Name;
    int m_Age;
};

Person::Person(string name, int age)
{
    this->m_Name = name;
    this->m_Age = age;
}

Person::~Person()
{
}

void test()
{
    //创建自定义数据类型容器
    vector<Person> v;

    Person p1("张三", 10);
    Person p2("李四", 20);
    Person p3("王五", 30);
    Person p4("赵六", 40);
    Person p5("七麻子", 50);

    //向容器中添加数据
    v.push_back(p1);
    v.push_back(p2);
    v.push_back(p3);
    v.push_back(p4);
    v.push_back(p5);

    //遍历容器
    for (vector<Person>::iterator it = v.begin(); it != v.end(); it++)
    {
        // cout << "姓名：" << (*it).m_Name << "\t年龄：" << (*it).m_Age << endl;
        cout << "姓名：" << it->m_Name << "\t年龄：" << it->m_Age << endl;
    }
}

void test02()
{
    //创建自定义数据类型容器
    vector<Person *> v;

    Person p1("张三", 10);
    Person p2("李四", 20);
    Person p3("王五", 30);
    Person p4("赵六", 40);
    Person p5("七麻子", 50);

    //向容器中添加数据
    v.push_back(&p1);
    v.push_back(&p2);
    v.push_back(&p3);
    v.push_back(&p4);
    v.push_back(&p5);

    //遍历容器
    for (vector<Person *>::iterator it = v.begin(); it != v.end(); it++)
    {
        // cout << "姓名：" << (*it).m_Name << "\t年龄：" << (*it).m_Age << endl;
        cout << "姓名：" << (*it)->m_Name << "\t年龄：" << (*it)->m_Age << endl;
    }
}

int main()
{
    // test();
    test02();
    return 0;
}