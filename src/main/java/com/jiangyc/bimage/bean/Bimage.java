/*
 * Bimage
 * Copyright (C) 2018 姜永春
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
 * along with this program.  If not, see [http://www.gnu.org/licenses/].
 */

package com.jiangyc.bimage.bean;

import lombok.Data;

@Data
public class Bimage {
    /** 图片ID */
    private int id;
    /** 图片名称 */
    private String name;
    /** 图片URL */
    private String url;
    /** 图片日期 */
    private String date;
    /** 图片描述 */
    private String summary;
}
