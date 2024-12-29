cmake_minimum_required(VERSION 3.10)

project(testcmake)

add_executable(testcmake maincmake.cpp test2.cpp)

install (TARGETS testcmake)
