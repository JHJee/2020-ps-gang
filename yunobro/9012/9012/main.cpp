//
//  main.cpp
//  9012
//
//  Created by Yun Hyeong Seo on 2020/10/11.
//

#include <iostream>
#include <stack>
#include <string>
using namespace std;

int T;

int isVPS(string line, int start, int end){
    stack<char> s;
    for(int i=start;i<end;i++){
        if(line[i]=='(') s.push(line[i]);
        if(line[i]==')'){
            if(s.empty()==true)return 0;
            if(s.top()=='(')s.pop();
        }
    }
    if(s.empty()==false)return 0;
    return 1;
}

int main(int argc, const char * argv[]) {
    string line;
    scanf("%d",&T);
    int *checked=new int[T];
    for(int i=0;i<T;i++){
        cin >> line;
        checked[i]=isVPS(line, 0, line.size());
    }
    for(int i=0;i<T;i++){
        if(checked[i]==0)printf("NO\n");
        else printf("YES\n");
    }
    
    return 0;
}
