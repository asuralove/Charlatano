/*
 * Charlatano is a premium CS:GO cheat ran on the JVM.
 * Copyright (C) 2016 Thomas Nappo, Jonathan Beaudoin
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.jire.arrowhead.linux

import com.sun.jna.Native
import com.sun.jna.NativeLibrary

object uio {
	
	@JvmStatic
	external fun process_vm_readv(pid: Int, local: iovec, liovcnt: Long, remote: iovec,
	                              riovcnt: Long, flags: Long): Long
	
	@JvmStatic
	external fun process_vm_writev(pid: Int, local: iovec, liovcnt: Long,
	                               remote: iovec, riovcnt: Long, flags: Long): Long
	
	init {
		Native.register(NativeLibrary.getInstance("c"))
	}
	
}