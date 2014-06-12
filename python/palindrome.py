#!/usr/bin/env python2.7

# This script will run NRT side by side test
# Steps:
# 0. Deploy two NRT storm topology, baseline and candidate
# 1. Copy latest LES data
# 2. Proceed LES data to CMS
# 3. Wait for NRT storm topology to process data
# 4. Get scoreboard from FeatureMetricBolt execute supervisor
# 5. Compare baseline and candidate metric to generate a side by side report
#
#
import argparse

def revert(x):
	if (x < 0):
		return False
	rev = 0
	while (x != 0):
		rev = rev * 10 + x%10
		x/=10
	return rev
	
def isPalindrome(x):
	if (x < 0):
		return False
	div = 1
	while (x / div >= 10):
		div *= 10;
	while (x != 0):
		l = x / div;
		r = x % 10;
		if (l != r):
			return False
		x = (x % div) / 10
		div /= 100
	return True

if __name__ == '__main__':
	"""
	This script will run NRT side by side test
	"""
	parser = argparse.ArgumentParser(description='Run NRT side by side test on baseline and candidate igor tag.')
	parser.add_argument('-n', '--number', dest='num', required=True,
	                   help='number', type=int)
	args = parser.parse_args()

	print 'Assert with left and right: %s'%isPalindrome(args.num)
	print 'Assert with revert: %s'%(args.num == revert(args.num))
