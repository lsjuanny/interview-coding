#! /usr/bin/env python
# -*- coding: iso-8859-15 -*-
import sys

def sortMaxList(m):
	# range(1,5) means from 1 to 4, excluded 5
	for j in range(1,3):
		if m[0] > m[j]:
			m[0],m[j] = m[j],m[0]
			print 'debug: m,j: %s,%s'%(m,j)

var = sys.argv[1:]
print 'var: %s'%var

m = [-sys.maxint-1]*3
print m

for i in var:
	if i > m[0]:
		m[0]=i
		print 'debug: m1: %s'%m
		sortMaxList(m)

print m