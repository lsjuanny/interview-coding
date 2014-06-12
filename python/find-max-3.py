#! /usr/bin/env python
# -*- coding: iso-8859-15 -*-
import sys

def sortMaxList(m):
	for j in range(1,2):
		if m[0] > m[j]:
			m[0],m[j] = m[j],m[0]

var = sys.argv[1:]
print 'var: %s'%var

m = [-sys.maxint-1]*3
print m

for i in var:
	if i > m[0]:
		m[0]=i
		sortMaxList(m)

print m