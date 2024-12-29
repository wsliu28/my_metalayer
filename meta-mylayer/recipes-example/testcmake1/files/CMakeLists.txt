cmake_minimum_required(VERSION 3.10)

project(testcmake1)

add_executable(testcmake1 maincmake1.cpp testcmake1.cpp)

install (TARGETS testcmake1)
